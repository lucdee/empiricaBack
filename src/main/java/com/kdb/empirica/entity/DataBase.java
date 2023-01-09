package com.kdb.enrichment.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="TB_DATABASE")
public class DataBase implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="id", nullable = false)
    private String id;

    @Column(name="nome", nullable = false)
    private String nome;

    @Column(name="bairro")
    private String bairro;

    @Column(name="endereco")
    private String endereco;

    @Column(name="cep")
    private String cep;

    @Column(name="cidade")
    private String cidade;

    @Column(name="logradouro")
    private String logradouro;

    @Column(name="numero")
    private String numero;

    @Column(name="complemento")
    private String complemento;

    @Column(name="cargo")
    private String cargo;

    @Column(name="lotacao")
    private String lotacao;

    @Column(name="ddd")
    private String ddd;

    @Column(name="celular")
    private String celular;

    @Column(name="telefone")
    private String telefone;

    @Column(name="classificacao")
    private String classificacao;

    @Column(name="codigoFolha")
    private String codigoFolha;

    @Column(name="descricao")
    private String descricao;

    @Column(name="dtNascimento", nullable = false)
    private String dtNascimento;

    @Column(name="email")
    private String email;

    @Column(name="estadoCivil")
    private String estadoCivil;

    @Column(name="folha")
    private String folha;

    @Column(name="margem")
    private String margem;

    @Column(name="matricula")
    private String matricula;

    @Column(name="pai")
    private String pai;

    @Column(name="mae", nullable = false)
    private String mae;

    @Column(name="regimeContratacao")
    private String regimeContratacao;

    @Column(name="cpf", nullable = false)
    private String cpf;

    @Column(name="rgExpedicao", nullable = false)
    private String rgExpedicao;

    @Column(name="orgao", nullable = false)
    private String orgao;

    @Column(name="rgNumero", nullable = false)
    private String rgNumero;

    @Column(name="rgOrgao", nullable = false)
    private String rgOrgao;

    @Column(name="rgUf", nullable = false)
    private String rgUf;

    @Column(name="sexo")
    private String sexo;

    @Column(name="uf", nullable = false)
    private String uf;

    @Column(name="associada", nullable = false)
    private String associada;

    @Column(name="filial", nullable = false)
    private String filial;
}
