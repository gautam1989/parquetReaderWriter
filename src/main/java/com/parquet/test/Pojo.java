package com.parquet.test;



public class Pojo {
  private long id;
  private String data;

  public Pojo() {
  }

  public Pojo(long id, String data) {
    this.id = id;
    this.data = data;
  }

  public long getId() {
    return id;
  }

  public String getData() {
    return data;
  }

  @Override
  public String toString() {
    return String.format("id:%s data:%s", id,data);
  }
}