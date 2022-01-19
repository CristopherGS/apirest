let url = 'https://jsonplaceholder.typicode.com/users'
fetch(url)
    .then(response => response.json())
    .then(data => mostrarData(data))
    .catch(error => console.log(error))

const mostrarData = (data) => {
    console.log(data)
    let body = ''
    for (let i = 0; i < data.length; i++) {
        body += `<tr class="fila"><td>${data[i].id}</td><td>${data[i].name}</td><td>${data[i].email}</td><td>${data[i].address.city}</td><td>
        <button type="button" id="info_cli" class="btn btn-default" aria-label="Left Align">
        <i class="fas fa-info-circle"></i>
</button>
        </td></tr>`
    }
    document.getElementById('data').innerHTML = body
}   