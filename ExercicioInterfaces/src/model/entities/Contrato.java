package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Contrato {
    private Integer numero;
    private LocalDate dataContrato;
    private Double valorContrato;    

    private List<Parcelamento> parcelamentos = new ArrayList<>();

    public Contrato() {
    }

    public Contrato(Integer numero, LocalDate dataContrato, Double valorContrato) {
        this.numero = numero;
        this.dataContrato = dataContrato;
        this.valorContrato = valorContrato;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public LocalDate getDataContrato() {
        return dataContrato; 
    }

    public void setDataContrato(LocalDate dataContrato) {
        this.dataContrato = dataContrato;
    }

    public Double getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(Double valorContrato) {
        this.valorContrato = valorContrato;
    }

    public List<Parcelamento> getParcelamentos() {
        return parcelamentos;
    }

    public void adicionarParcelamento(Parcelamento parcelamento) {
        parcelamentos.add(parcelamento);
    }
}
