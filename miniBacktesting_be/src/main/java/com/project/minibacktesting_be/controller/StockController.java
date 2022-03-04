package com.project.minibacktesting_be.controller;

import com.project.minibacktesting_be.dto.BacktestingRequestDto;
import com.project.minibacktesting_be.dto.BacktestingResponseDto;
import com.project.minibacktesting_be.repository.CommentRepository;
import com.project.minibacktesting_be.repository.StockDataRepository;
import com.project.minibacktesting_be.repository.StockInfoRepository;
import com.project.minibacktesting_be.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class StockController  {

   private final StockService stockService;
   private final StockDataRepository stockDataRepository;
   private final StockInfoRepository stockInfoRepostiory;


    //백테스팅 계산하기
    @PostMapping("/api/comment")
    public BacktestingResponseDto creatComment(@RequestBody BacktestingRequestDto backtestingRequestDto){
        return stockService.backtestingCal();

    }

}