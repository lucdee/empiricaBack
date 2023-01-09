package com.kdb.enrichment.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_ABSENT)
public class DataBaseDTO {

    @JsonProperty("id")
    private String id;

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("bairro")
    private String bairro;

    @JsonProperty("endereco")
    private String endereco;

    @JsonProperty("cep")
    private String cep;

    @JsonProperty("cidade")
    private String cidade;

    @JsonProperty("logradouro")
    private String logradouro;

    @JsonProperty("numero")
    private String numero;

    @JsonProperty("complemento")
    private String complemento;

    @JsonProperty("cargo")
    private String cargo;

    @JsonProperty("lotacao")
    private String lotacao;

    @JsonProperty("ddd")
    private String ddd;

    @JsonProperty("celular")
    private String celular;

    @JsonProperty("telefone")
    private String telefone;

    @JsonProperty("classificacao")
    private String classificacao;

    @JsonProperty("codigoFolha")
    private String codigoFolha;

    @JsonProperty("descricao")
    private String descricao;

    @JsonProperty("dtNascimento")
    private String dtNascimento;

    @JsonProperty("bairro")
    private String email;

    @JsonProperty("estadoCivil")
    private String estadoCivil;

    @JsonProperty("folha")
    private String folha;

    @JsonProperty("margem")
    private String margem;

    @JsonProperty("matricula")
    private String matricula;

    @JsonProperty("pai")
    private String pai;

    @JsonProperty("mae")
    private String mae;

    @JsonProperty("regimeContratacao")
    private String regimeContratacao;

    @JsonProperty("cpf")
    private String cpf;

    @JsonProperty("rgExpedicao")
    private String rgExpedicao;

    @JsonProperty("orgao")
    private String orgao;

    @JsonProperty("rgNumero")
    private String rgNumero;

    @JsonProperty("rgOrgao")
    private String rgOrgao;

    @JsonProperty("rgUf")
    private String rgUf;

    @JsonProperty("sexo")
    private String sexo;

    @JsonProperty("uf")
    private String uf;

    @JsonProperty("associada")
    private String associada;

    @JsonProperty("filial")
    private String filial;
}
