package com.agu.gestaoescalabackend.dto;
import com.agu.gestaoescalabackend.client.request.TarefaLoteRequest;
import com.agu.gestaoescalabackend.dto.LoginDTO;
import com.agu.gestaoescalabackend.util.Conversor;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@Data
public class InsertTarefasLoteDTO {
    @NotNull
    private LoginDTO login;

    private String etiqueta;
    @NotNull
    private int especieTarefa;
    @NotNull
    private int setorResponsavel;
    @NotNull
    private int usuarioResponsavel;
    @NotNull
    private int setorOrigem;
    @NotNull
    private String prazoInicio;
    @NotNull
    private String prazoFim;

    private FiltroDTO filtroPautas;

    @NotNull
    private String[] listaProcessosJudiciais;

    public TarefaLoteRequest toRequest(){
        return Conversor.converter(this, TarefaLoteRequest.class);
    }
}
