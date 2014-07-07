package io.vertx.test.codegen.testapi;

import io.vertx.core.gen.VertxGen;

/**
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
@VertxGen
public interface NestedInterface {

  void foo(String str);

  interface Wibble {
    void bar(String str);
  }
}
