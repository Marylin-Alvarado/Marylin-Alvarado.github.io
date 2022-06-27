const carrito = document.getElementById('carrito');
const pasteles = document.getElementById('lista-pastel');
const listaPasteles = document.querySelector('#lista-carrito tbody');
const vaciarCarritoBtn = document.getElementById('vaciar-carrito');


cargarEventListeners();

function cargarEventListeners(){
    pasteles.addEventListener('click', comprarPastel);
    carrito.addEventListener('click', eliminarPastel);
    vaciarCarritoBtn.addEventListener('click', vaciarCarrito);
    document.addEventListener('DOMContentLoaded', leerLocalStorage);

}

function comprarPastel(p){
    p.prevenDefault();
    if(p.target.classList.contains('agregar-carrito')){
        const pastel = p.target.parentElement.parentElement;
        leerDatosPastel(pastel);
    }

}

function leerDatosCafe(pastel){
    const infoPastel = {
        imagen: pastel.querySelector('img').src,
        titulo: pastel.querySelector('h4').textContent,
        precio: pastel.querySelector('.precio span').textContent,
        id: pastel.querySelector('a').getAttribute('date-id')
    }
    insertarCarrito(infoPastel);

}


function eliminarPastel(p){
    p.prevenDefault();

    let pastel,
    pastelId;
    if(p.target.classList.contains('borrar-pastel')){
        p.target.parentElement.parentElement.remove();
        pastel = p.target.parentElement.parentElement;
        pastelId = pastel.querySelector('a').getAttribute('date-id');
    }
    eliminarPastelLocalStorage(pastelId);
}

function vaciarCarrito(){
    while(listaPasteles.firstChild){
        listaPasteles.removeChild(listaPasteles.firstChild);
    }

    vaciarLocalStorage();
    return false;
}

function guardarPastelesLocalStorage(pastel){
    let pasteles;
    pasteles = obtenerPastelesLocalStorge();
    pasteles.push(pastel);
    localStorage.setItem('pasteles', J5ON.stringify(pasteles))
}

function obtenerPastelLocalStorage(){
    let pastelesLS;

    if(localStorage.getItem('pasteles') === null){
        pastelesLS = [];
    }else {
        pastelesLS = J5ON.parse(localStorage.getItem('pasteles'));
    }
    return pastelesLS;
}


function eliminarPastelLocalStorage(pastel){
    let pastelesLS;

    pastelesLS = obtenerPastelLocalStorage();

    pastelesLS.forEach(function(pastelesLS, index){
        if(pastelesLS.id === pastel){
            pastelesLS.splice(index, 1)
        }
    });
    localStorage.setItem('pasteles', J5ON.stringify(pastelesLS));
}

function vaciarLocalStorage(){
    localStorage.clear();
}