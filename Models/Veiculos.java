package Models;

public abstract class Veiculos implements Model {
    private Long id;

    private String Placa;
    // private String cor;
    // private Integer ano;
    // private Combustivel tipoCombustivel;
    // private byte Nportas;
    // private long kmRodados;
    // private String Renavam;
    // private String Chassi;
    private Float diaria;

    public Float getDiaria() {
        return diaria;
    }

    public void setDiaria(Float diaria) {
        this.diaria = diaria;
    }

    // public Veiculos(String placa, String cor, Integer ano, Combustivel
    // tipoCombustivel, byte nportas, long kmRodados,
    // String renavam, String chassi) {
    // Placa = placa;
    // this.cor = cor;
    // this.ano = ano;
    // this.tipoCombustivel = tipoCombustivel;
    // Nportas = nportas;
    // this.kmRodados = kmRodados;
    // Renavam = renavam;
    // Chassi = chassi;
    // }

    public String getPlaca() {
        return Placa;
    }

    // public String getCor() {
    // return cor;
    // }

    // public Integer getAno() {
    // return ano;
    // }

    // public Combustivel getTipoCombustivel() {
    // return tipoCombustivel;
    // }

    // public byte getNportas() {
    // return Nportas;
    // }

    // public long getKmRodados() {
    // return kmRodados;
    // }

    // public String getRenavam() {
    // return Renavam;
    // }

    // public String getChassi() {
    // return Chassi;
    // }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Placa == null) ? 0 : Placa.hashCode());
        // result = prime * result + ((Renavam == null) ? 0 : Renavam.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Veiculos other = (Veiculos) obj;
        if (Placa == null) {
            if (other.Placa != null)
                return false;
        } else if (!Placa.equals(other.Placa))
            return false;
        // if (Renavam == null) {
        // if (other.Renavam != null)
        // return false;
        // } else if (!Renavam.equals(other.Renavam))
        // return false;
        return true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

}