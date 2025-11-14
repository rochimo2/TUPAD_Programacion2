public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;

    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.bateria = bateria;
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Bateria getBateria() {
        return bateria;
    }
}
