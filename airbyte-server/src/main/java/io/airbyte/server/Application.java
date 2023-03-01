/*
 * Copyright (c) 2023 Airbyte, Inc., all rights reserved.
 */

package io.airbyte.server;

import io.micronaut.runtime.Micronaut;

/**
 * Config Server Micronaut App.
 */
public class Application {

  public static void main(final String[] args) {
    Micronaut.run(Application.class, args);
  }

}
