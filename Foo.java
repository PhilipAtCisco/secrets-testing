class Foo {

  // Random private key
  // -----BEGIN RSA PRIVATE KEY-----
  //MIIEpAIBAAKCAQEAwvupM+d2dadQKa5MKJM8JkoGh9qSC6ulKXuj8LhweYBv73u8
  //qjyT2tuiIUyiqMRueqdGwAaUAtsDmU9tRSPNddg1N8xWKpJ6PY5Fxb0dqPZ91/t/
  //SYTfX25m/cjKm4diAT9/O5QOYnXz0fxiDFXMRFGnrhGi4zTSyyDdlPWRlvGtlUcJ
  //eJU6QmNgUvtZOnP0CNEbhCCVGkEeDRNz3qPlBbGoFi6J268A/NASIWA2l/0QN5jv
  //Iz50C3M4QzruIgxOHlULqk6I0pkiWW4UKatp4k5KARI9BsFCD2D9L76XGg3UE7Xy
  //3JUO41Hl6jduNqwE3DMbMlH9CLUekbN2nSqIAwIDAQABAoIBAQCsNtKvgVRjfi+T
  //YNrrS3/o4aD7BNXRcP0jsoyN5JmS9xnmj4eHZJHC0BJXDvTr0vMxaeVXXXgFPaPk
  //GP8N/h1OZHQ8oEHKwC0viSWfDPXRckScKwm1yaHxC/XzWRF6ZQzuxUJ/QLmjxUJg
  //yWVgN7d+8BAF8pXHz7QOrSyIkIzSn4BSR2dBnpoqb2jFKsF93HH4XM3NRmymlXoJ
  //BaTfRDmmdUMPVVM2qtzBrTFJEclWvvrrbpaG+EOJYkwyOH0hJZfVm9lR/30H/G7W
  //9nhjWQRujQ86bRj8Z/E7GZIiHTNt0nKL0q2O8nrDuUHAerfc6mOe0mRlCHJRCcaw
  //yJPuMfshAoGBAOORv41AonPAXXCejVi5+85WPqc4gTAkoSCgmlIJgZEPgOHL2tef
  //xj8wYR3ggPGVQ95S/QHEhciBSQzftbqCo3uuYTp+H3bVdRf1HhW/ckpQxPxz2ekp
  //vreGOQZbfQDnp93wp5xLzcL87GlVmsh0UhnMPhukMri2GIXGwfdWWs4XAoGBANtX
  //uETcO3eD1p4dCTmNF4EndYDCD1To4NvD5rwE9ulLIK/ovoAiaG6rE/5u4656t49b
  //9ekQdrVnW/qmI9FqSlY8R5qx+VSmL2u6WoE/CMaoXkWKQ6by/sQNT1H45XKOAmW8
  //kbhDZlzEXBYgeKnUYrnJ7c06Y5c2zT8/4ZKQkpT1AoGBAJfBwjO4Pp1iUu2fTjM1
  //E67t5KovDDfGtYzEjSTYIgdSh2gMQcw5SEMrSBhcdqCkIbZJMV/UZkLntIdZSB8w
  //r0TzbPNM2D6u6n8nfwCRwu28HyEbQN40cHKCl9Sdfib0VQW0TpH0GytE74LvC2FR
  //8M4zXdehEBINnRzZBtCiTbvRAoGAezzgBaCPsOjcLt41jqZdbG2VMZDXOGfX3uJE
  //w6Mub4mMhgmI70llz7hDdZMsTZ4ZgGy00Aw2BlpabYvnWAQWXDlmKd6RLiRpRGfh
  //7fhSn/t9bCjxNd4VkmXACViE4kYzxqGaZiNIYhrZen0oDpOMHML9329NAWsDCuSD
  //guvDz/kCgYA07NTzqiPaiTvu5dmrwqUS8+FlBr+JVHV8BRCNlLPkEx9LYRD8pKq4
  //dHUF/30LYyj7FM6mxVU11IHsaQxVYNDAZW02fg7mdZAUzlKdAOV7IBY6SN4puLjQ
  //lwc/s1LrNWu28uyKd5ycxH0BTZNPMhZuhvnprkWHoRN5eKYG3H/YNA==
  //-----END RSA PRIVATE KEY-----
  //
  // JWT
  //
  // {
  // "ver": 1,
  // "iss": "https://example.org/oauth2/asdfjkl",
  // "aud": "api://foo",
  // "sub": "random@example.org",
  // "iat": 1737053717,
  // "exp": 1737054017,
  // "cid": "00000000000000000000",
  // "uid": "00000000000000000000",
  // "scp": [
  //   "profile",
  // ],
  // "auth_time": 1737053668,
  // "client_product": "foo"
  // }

  public void test() {
      String authToken = "Bearer eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJ2ZXIiOjEsImlzcyI6Imh0dHBzOi8vZXhhbXBsZS5vcmcvb2F1dGgyL2FzZGZqa2wiLCJhdWQiOiJhcGk6Ly9mb28iLCJzdWIiOiJyYW5kb21AZXhhbXBsZS5vcmciLCJpYXQiOjE3MzcwNTM3MTcsImV4cCI6MTczNzA1NDAxNywiY2lkIjoiMDAwMDAwMDAwMDAwMDAwMDAwMDAiLCJ1aWQiOiIwMDAwMDAwMDAwMDAwMDAwMDAwMCIsInNjcCI6WyJwcm9maWxlIl0sImF1dGhfdGltZSI6MTczNzA1MzY2OCwiY2xpZW50X3Byb2R1Y3QiOiJmb28ifQ.ekKLCiVnPkHlDvE7S4C_vxnmAAqWE7drSC8FBFM8aOL3zqyNctk6UAYg6zaiufkAWYBo4DLgOAlo1G1YliKGrws_qVFf8jh7VUNYe-XVfFKcl3b0sIK18-NSnyIDJszeSQoeZksH8wBFn92HfI_VnFlPNwGfFZZUIOLBK9d0PZ4ehVKtDRS_LD8MYrO1cQpGTiEA3-MSfkrl6eUabBlxoWSGjGvyThm7JycgZfv15igbwfjtHc4Ko_Aoz0wpqVUpI5kGPD-ScX4CmG1Wf96FJGQQ6fVT_VnVJmxWCsLJtcfo6xKEf5EfO_CXQEpGjxRYuSbHFxoPxt1acUli-bwF-w";
  }
}
