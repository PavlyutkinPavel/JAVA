package com.tms.hw43_44_rest.domain;

import lombok.Data;
@Data
public class FileData {
    private Long id;

    private String fileName;
    private byte[] fileData;
    // Добавьте другие поля, если необходимо
}

