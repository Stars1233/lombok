public @lombok.extern.jackson.Jacksonized @lombok.Builder @com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = JacksonizedNoConfigChoice.JacksonizedNoConfigChoiceBuilder.class) class JacksonizedNoConfigChoice {
  public static @java.lang.SuppressWarnings("all") @lombok.Generated @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "",buildMethodName = "build") class JacksonizedNoConfigChoiceBuilder {
    private @java.lang.SuppressWarnings("all") @lombok.Generated int field1;
    @java.lang.SuppressWarnings("all") @lombok.Generated JacksonizedNoConfigChoiceBuilder() {
      super();
    }
    /**
     * @return {@code this}.
     */
    public @java.lang.SuppressWarnings("all") @lombok.Generated JacksonizedNoConfigChoice.JacksonizedNoConfigChoiceBuilder field1(final int field1) {
      this.field1 = field1;
      return this;
    }
    public @java.lang.SuppressWarnings("all") @lombok.Generated JacksonizedNoConfigChoice build() {
      return new JacksonizedNoConfigChoice(this.field1);
    }
    public @java.lang.Override @java.lang.SuppressWarnings("all") @lombok.Generated java.lang.String toString() {
      return (("JacksonizedNoConfigChoice.JacksonizedNoConfigChoiceBuilder(field1=" + this.field1) + ")");
    }
  }
  int field1;
  @java.lang.SuppressWarnings("all") @lombok.Generated JacksonizedNoConfigChoice(final int field1) {
    super();
    this.field1 = field1;
  }
  public static @java.lang.SuppressWarnings("all") @lombok.Generated JacksonizedNoConfigChoice.JacksonizedNoConfigChoiceBuilder builder() {
    return new JacksonizedNoConfigChoice.JacksonizedNoConfigChoiceBuilder();
  }
}