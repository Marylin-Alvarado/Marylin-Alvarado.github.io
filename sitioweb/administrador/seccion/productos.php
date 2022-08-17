<?php include("../template/cabecera.php"); ?>
<?php
$txtID = (isset($_POST['txtID'])) ? $_POST['txtID'] : "";
$txtNombre = (isset($_POST['txtNombre'])) ? $_POST['txtNombre'] : "";
$txtImagen = (isset($_POST['txtImagen']['name'])) ? $_FILES['txtImagen']['name'] : "";
$accion = (isset($_POST['accion'])) ? $_POST['accion'] : "";

include("../config/bd.php");

$sentenciaSQL = $conexion->prepare("SELECT * FROM productos");
$sentenciaSQL->execute();
$listaProductos = $sentenciaSQL->fetchAll(PDO::FETCH_ASSOC);

?>
<div class="col-md-5">

    <div class="card">
        <div class="card-header">
            Datos de Producto
        </div>
        <div class="card-body">

            <form method="POST" enctype="multipart/form-data">
                <div class="form-group">
                    <label for="txtID">ID:</label>
                    <input type="text" required readonly class="form-control" value="<?php echo $txtID; ?>" name="txtID" id="txtID" placeholder="ID">
                </div>

                <div class="form-group">
                    <label for="txtID">Nombre:</label>
                    <input type="text" required class="form-control" value="<?php echo $txtNombre; ?>" name="txtNombre" id="txtNombre" placeholder="Nombre del producto">
                </div>

                <div class="form-group">
                    <label for="txtID">Imagen:</label>
                    <?php echo $txtImagen; ?>

                    <?php
                    if ($txtImagen != "") { ?>
                        <img class="img-thumbnail rounded" src="../../img/<?php echo $txtImagen; ?>" width="50" alt="" srcset="" ; <?php
                                                                                                                                }
                                                                                                                                    ?> <input type="file" required class="form-control" name="txtImagen" id="txtImagen" placeholder="Nombre de la imagen">
                </div>

                <div class="btn-group" role="group" aria-label="">
                    <button type="button" name="accion" <?php echo ($accion == "Seleccionar") ? "disabled" : ""; ?> value="Agregar" class="btn btn-success">Agregar</button>
                    <button type="button" name="accion" <?php echo ($accion != "Seleccionar") ? "disabled" : ""; ?> value="Agregar" class="btn btn-warning">Modificar</button>
                    <button type="button" name="accion" <?php echo ($accion != "Seleccionar") ? "disabled" : ""; ?> value="Agregar" class="btn btn-info">Cancelar</button>
                </div>


            </form>
        </div>

    </div>



</div>
<div class="col-md-7">
    <table class="table table-border">
        <thead>
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Imagen</th>
                <th>Acciones</th>
            </tr>
        </thead>
        <tbody>
            <?php foreach ($listaProductos as $producto) { ?>

                <tr>
                    <td><?php echo $producto['id']; ?></td>
                    <td><?php echo $producto['nombre']; ?></td>
                    <td>
                        <img class="img-thumbnail rounded" src="../../img/<?php echo $producto['imagen']; ?>" width="" alt="" srcset="">

                    </td>


                    <td><?php echo $producto['imagen']; ?></td>
                    <td>

                        <form method="post">
                            <input type="hidden" name="textID" id="txtID" value="<?php echo $Producto['id']; ?>" />

                            <input type="submit" name="accion" value="Seleccionar" class="btn btn-primary" />

                            <input type="submit" name="accion" value="Borrar" class="btn btn-danger" />

                    </td>
                </tr>
            <?php } ?>
        </tbody>
    </table>
</div>

<?php include("../template/pie.php"); ?>