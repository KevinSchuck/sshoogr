/*
 * Copyright (C) 2011-2016 Aestas/IT
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aestasit.infrastructure.ssh.log

import org.fusesource.jansi.AnsiConsole
import static org.fusesource.jansi.Ansi.*
import static org.fusesource.jansi.Ansi.Color.*

/**
 * Standard output logger with ANSI colors.
 *
 * @author Luciano Fiandesio
 *
 */
class AnsiLogger implements Logger {

  public AnsiLogger() {
  	AnsiConsole.systemInstall()
  }	
  
  void info(String message) {
    println(ansi().fg(BLUE).a(message).reset())
  }

  void warn(String message) {
  	println(ansi().fg(YELLOW).a(message).reset())
  }

  void debug(String message) {
    println(ansi().fg(GREEN).a(message).reset())
  }

  void stdOutput(String line) {
    println(ansi().fg(WHITE).a(line).reset())
  }

  void errOutput(String line) {
    println(ansi().fg(RED).a(line).reset())
  }

  void progress(String progress) {
    print(ansi().fg(WHITE).a(progress).reset())
  }

  void progressEnd() {
    println()
  }

}