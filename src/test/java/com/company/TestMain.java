package com.company;

import java.io.InputStream;
import org.junit.Test;

public class TestMain {


  @Test
  public void SampleInput0() {

    ExecuteMain("sampleInput0");
  }

  @Test
  public void SampleInput1() {

    ExecuteMain("sampleInput1");
  }

  @Test
  public void SampleInput3() {

    ExecuteMain("sampleInput2");
  }

  private void ExecuteMain(String fileName) {

    System.out.println("main");
    String[] args = null;
    final InputStream original = System.in;
    final InputStream file = TestMain.class.getClassLoader().getResourceAsStream(fileName);
    System.setIn(file);
    com.company.Main.main(args);
    System.setIn(original);
  }


}
