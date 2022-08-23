var destaques = [
    {
        "img":"https://images.cea-ecommerce.com.br/site/2021/artes-semana-10/masculino/bubbles-categorias/bubble-2-moletom.png",
        "title":"Moda Masculina",
        "backfundo":"#171A23"
    },
    {
        "img": "https://cdn.shopify.com/s/files/1/0555/2426/1935/products/H69412fed28364f0fa0095578212e120eU-removebg-preview_480x480_crop_center.png?v=1646737618",
        "title":"Relógios de Luxo",
        "backfundo": '#00000'

    },
    {
        "img":"https://cdn-0.imagensemoldes.com.br/wp-content/uploads/2020/06/Fone-de-Ouvido-PNG.png",
        "title":"Acessórios Tecnológicos",
        "backfundo":"#171A23"
    },

]

var cards = document.querySelector(".card-destaque")

function carregar() {
    destaques.forEach(item => {
        let novoCard = cards.cloneNode(true)

        novoCard.classList.remove("model")

        novoCard.querySelector("#imagem").src = item.img
        novoCard.querySelector("#titulo").innerHTML = item.title
        
        novoCard.style.background = item.backfundo

        document.querySelector(".cont-card-destaque").appendChild(novoCard)
    })
}