package com.welsumo.learn.dev.appsumo.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(value = "products")
public class Product {

  @Id
  public String id;

  @Field("type")
  public String productType;

  @Field("name")
  public String productName;

  @Field("price")
  public int productPrice;

  @Field("quality")
  public String productQuality;

  @Field("rating")
  public String productRating;

  @Field("inStock")
  public int productStock;

  @Field("brand")
  public String productBrand;
}
