function verificarCampos() {
    var titulo = document.getElementById('titulo').value.trim();
    var nome = document.getElementById('nome').value.trim();
    var ano = document.getElementById('ano').value.trim();

    if (titulo === "" || nome === "" || ano === "") {
        document.getElementById('mensagem-erro').style.display = 'block';
    } else {
        document.getElementById('mensagem-erro').style.display = 'none';
        alert('Música cadastrada com sucesso');
    }
}

function cancelarCampos() {
    document.getElementById("titulo").value = "";
    document.getElementById("nome").value = "";
    document.getElementById("ano").value = "";
}




