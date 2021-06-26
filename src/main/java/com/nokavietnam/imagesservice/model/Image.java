package com.nokavietnam.imagesservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : NOKA NGUYEN
 * @since : 6/26/2021, Sat
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Image {
    private Integer uid;
    private String title;
    private String url;
}
