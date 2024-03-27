package me.dio.sdw24.application;

import me.dio.sdw24.domain.model.Champion;
import me.dio.sdw24.domain.ports.ChampionsRepository;

import java.util.List;

public record AskChampionsUseCase(ChampionsRepository repository) {

    public String askChampion(Long championId, String question){
        return "";
    }
}
