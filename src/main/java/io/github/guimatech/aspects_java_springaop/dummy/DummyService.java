package io.github.guimatech.aspects_java_springaop.dummy;

import org.springframework.stereotype.Service;

@Service
public class DummyService {
  public void dummy() {
    System.out.println("Dummy");
  }
}
