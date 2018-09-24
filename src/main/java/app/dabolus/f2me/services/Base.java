package app.dabolus.f2me.services;

import java.io.File;
import java.io.IOException;

abstract class Base {
  File input;

  Base(File input) {
    this.input = input;
  }

  abstract void process(File output) throws IOException;
}
