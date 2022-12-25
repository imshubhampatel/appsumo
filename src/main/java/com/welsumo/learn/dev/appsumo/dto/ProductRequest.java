package com.welsumo.learn.dev.appsumo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ProductRequest {

  public String productType;

  public String productName;

  public int productPrice;

  public String productQuality;

  public String productRating;

  public int productStock;

  public String productBrand;
}
