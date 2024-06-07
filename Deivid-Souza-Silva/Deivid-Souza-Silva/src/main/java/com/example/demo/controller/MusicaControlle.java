package com.example.demo.controller;

import com.example.demo.entity.Musica;
import com.example.demo.repository.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/musicas")
public class MusicaControlle {
    @Autowired
    private MusicaRepository musicaRepository;
    @GetMapping("/{id}")
    public Musica encontrarMusicaPorId(@PathVariable(value = "id") long id){

       return musicaRepository.findById(id).get();
    }
    @GetMapping
    public List<Musica> listaDeMusicas(){
        return musicaRepository.findAll();
    }
    @PostMapping
    public Musica musicaAdicionada(@RequestBody Musica musica){
        return musicaRepository.save(musica);
    }
}
