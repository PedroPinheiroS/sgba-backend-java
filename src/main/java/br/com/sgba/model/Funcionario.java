package br.com.sgba.model;

import java.time.LocalDateTime;

public class Funcionario {

    Long idFuncionario;
    Long idUsuario;
    String nome;
    LocalDateTime horarioEntradaServico;
    LocalDateTime horarioSaidaServico;
    LocalDateTime horarioEntradaServicoCliente;
    LocalDateTime horarioSaidaServicoCliente;

    public Funcionario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public LocalDateTime getHorarioEntradaServico() {
        return horarioEntradaServico;
    }

    public void setHorarioEntradaServico(LocalDateTime horarioEntradaServico) {
        this.horarioEntradaServico = horarioEntradaServico;
    }

    public LocalDateTime getHorarioSaidaServico() {
        return horarioSaidaServico;
    }

    public void setHorarioSaidaServico(LocalDateTime horarioSaidaServico) {
        this.horarioSaidaServico = horarioSaidaServico;
    }

    public LocalDateTime getHorarioEntradaServicoCliente() {
        return horarioEntradaServicoCliente;
    }

    public void setHorarioEntradaServicoCliente(LocalDateTime horarioEntradaServicoCliente) {
        this.horarioEntradaServicoCliente = horarioEntradaServicoCliente;
    }

    public LocalDateTime getHorarioSaidaServicoCliente() {
        return horarioSaidaServicoCliente;
    }

    public void setHorarioSaidaServicoCliente(LocalDateTime horarioSaidaServicoCliente) {
        this.horarioSaidaServicoCliente = horarioSaidaServicoCliente;
    }

    public Long getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Long idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", horarioEntradaServico=" + horarioEntradaServico +
                ", horarioSaidaServico=" + horarioSaidaServico +
                ", horarioEntradaServicoCliente=" + horarioEntradaServicoCliente +
                ", horarioSaidaServicoCliente=" + horarioSaidaServicoCliente +
                '}';
    }
}
