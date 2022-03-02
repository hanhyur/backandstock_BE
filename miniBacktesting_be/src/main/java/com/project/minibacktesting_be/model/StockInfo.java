package com.project.minibacktesting_be.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Entity
public class StockInfo {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private String stockName;

    @Column(nullable = false)
    private Long stockCode;

    @Column(nullable = false)
    private LocalDate publicDate;

    @Column(nullable = false)
    private String market;

}