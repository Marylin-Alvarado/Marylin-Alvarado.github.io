const carrito = document.getElementById('carrito');
const pasteles = document.getElementById('lista-pastel');
const listaPasteles = document.querySelector('#lista-carrito tbody');
const vaciarCarritoBtn = document.getElementById('vaciar-carrito');

cargarEventListeners();

function cargarEventListeners (){
    pasteles.addEventListener('click', comprarPastel);
    carrito.addEventListener('click', eliminarPastel);
    vaciarCarritoBtn.addEventListener('click', vaciarCarrito);
    document.addEventListener('DOMContentLoaded', leerLocalStorage)
}

function comprarPastel(e){
    e.preventDefault();
    if(e.target.classList.contains('agregar-carrito')){
        const pastel = e.target.parentElement.parentElement;
        leerDatosPastel(pastel);
    }
}

function leerDatosPastel(pastel){
    const infoPastel = {
        imagen: pastel.querySelector('img').src,
        titulo: pastel.querySelector('h4').textContent,
        precio: pastel.querySelector('precio span').textContent,
        id: pastel.querySelector('a').getAttribute('date-id')
    }
    insertarCarrito(infoPastel);
}

function insertarCarrito(pastel) {
    const row = document.createElement('tr');
    row.innerHTML = `
    <td>
       <img src="${pastel.imagen}" width=100>
    </td>
    <td>${pastel.titulo}</td>
    <td>${pastel.precio}</td>
    <td>
       <a href="#" class="borrar-pastel" data-id="${pastel.id}">X</a>
    </td>
    `;
    listaPasteles.appendChild(row);
    guardarPastelLocalStorage(pastel);
}


function eliminarPastel(e) {
    e.preventDefault();

    let pastel,
    pastelId;
    if(e.target.classList.contains('borrar-pastel')){
        e.target.parentElement.parentElement.remove();
        pastel = e.target.parentElement.parentElement;
        pastelId = pastel.querySelector('a').getAttribute('data-id');
    }
    eliminarPastelLocalStorage(pastelId);
}

function vaciarCarrito() {
    while(listaPasteles.firstChild){
        listaPasteles.removeChild(listaPasteles.firstChild);

    }

    vaciarLocalStorage();
    return false;
}

function guardarPastelLocalStorage(pastel) {
    let pasteles;
    pasteles = obtenerPastelesLocalStorage();
    pasteles.push(pastel);
    localStorage.setItem('pasteles', JSON.stringify(pasteles))
}

function obtenerPastelesLocalStorage() {
    let pastelesLS;

    if (localStorage.getItem('pasteles') == null){
        pastelesLS = [];
    }else {
        pastelesLS = JSON.parse(localStorage.getItem('pasteles'));
    }
    return pastelesLS;
}

function leerLocalStorage() {
    let pastelesLS;

    pastelesLS = obtenerPastelesLocalStorage();

    pastelesLS.forEach(function (pastel){
        const row = document.createElement('tr');
        row.innerHTML = `
        <td>
           <img src="${pastel.imagen}" width=100>
           </td>
           <td>${pastel.titulo}</td>
           <td>${pastel.precio}</td>
           <td>
              <a href="#" class="borrar-pastel" data-id="${pastel.id}">X</a>
            </td>
           `;
           listaPasteles.appendChild(row);
    });
}

function eliminarPastelLocalStorage(pastel) {
    let pastelesLS;

    pastelesLS = obtenerPastelesLocalStorage();

    pastelesLS.forEach(function (pastelesLS, index){
        if(pastelesLS.id === pastel) {
            pastelesLS.splice(index, 1)
        }
    });

    localStorage.setItem('pasteles', JSON.stringify(pastelesLS));
}

function vaciarLocalStorage() {
    localStorage.clear();

}