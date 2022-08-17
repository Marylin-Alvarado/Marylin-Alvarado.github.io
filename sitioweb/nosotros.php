<?php include("template/cabecera.php"); ?>


<div class="jumbotron">
            <div id="header_bar">
                <div class="header_bar_container">
                   <h1>
                     <img src="img/corazontitle_1.png" alt="corazon">
                     "Quienes Somos"
                     <img src="img/corazontitle_2.png" alt="corazon">

                    </h1>
                </div>
            </div>
            <div id="container">
                <div class="menu">
                <img width="400" src="img/Pasteleria.jpg" class="img-thumbnail rounded mx-auto d-block"/>
                <p>"Dulce Capricho nace en 2022 como un nuevo concepto integral en Reposteria fina con ventas exclusivamente por Online, lo que nos permite ofrecerte productos artesanales de la mas alta calidad a precios muy accesible."
                    <br>
                    <br>
                El principal objetivo es brindarte lo mas deliciosos y vistosos postres ademas de complementos para que tu evento sea especial e inolvidable."
                <br>
                <br>
                "Para realizar tu pedido puedes contactarnos en la Ciudad de Loja al 09 887 776, via e-mail a info@dulcecapricho.com o rellenando el formulario"
                </p>
                <div class="banda"></div>
            </div>
            <div id="contacto"></div>
            <div class="contacto">
                <div class="title">
                    "Acerca de Dulce Capricho"
                    <p>
                        "Dulce Capricho es el lugar donde puedes encontrar los mas deliciosos pasteles, galletas, trufas y los mejores detalles para esa ocacion especial."
                    </p>
                </div>
                <div class="form">
                    <form action="../index.php" method="post" id="contact:form">
                        <ul>
                            <li>
                                <label for="name">
                                    "nombre"
                                    <span class="sup"> * </span>
                                </label>
                                <input type="txt" name="name" id="name">
                                <div id="name_error" class="error">Introduce un Nombre</div>
                            </li>
                            <li>
                            <label for="telefono">
                                    "telefono"
                                    <span class="sup"> * </span>
                                </label>
                                <input type="txt" name="telefono" id="telefono">
                                <div id="telefono_error" class="error">Ingresa un telefono</div>
                            </li>
                            <li>
                            <label for="email">
                                    "email"
                                    <span class="sup"> * </span>
                                </label>
                                <input type="txt" name="email" id="email">
                                <div id="email_error" class="error">Ingresa un email</div>
                            </li>
                            <li style="position:static; top:15px; right:0;">
                            <label for="message">
                                    "mensaje"
                                    <span class="sup"> * </span>
                                </label>
                                <textarea name="message" id="message" rows="5" cols="5">
                                </textarea>
                                <div id="message_error" class="error">Introduce un Mensaje</div>
                        </li>
                        <li>
                            <p id="mail_success" class="success">Gracias, me pondre en contacto lo mas pronto posible. </p>
                            <p id="mail_fail" class="error">Lo siento, ocurrio un error. Vuelva a intentarlo</p>
                            <div id="button">
                                <input type="submit" id="send_message" class="button" value="Enviar"> 
                            </div>

                        </li>
                        </ul>
                    </form>
                </div>
            </div>
</div>

            

 <?php include("template/pie.php"); ?>
     