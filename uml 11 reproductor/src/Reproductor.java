public class Reproductor {
    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo: " + cancion.getTitulo()
                + " cantada por " + cancion.getArtista().getNombre());
    }
}
