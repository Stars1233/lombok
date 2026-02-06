@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = JacksonizedNoConfigChoice.JacksonizedNoConfigChoiceBuilder.class)
public class JacksonizedNoConfigChoice {
	int field1;
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	JacksonizedNoConfigChoice(final int field1) {
		this.field1 = field1;
	}
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	@com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "", buildMethodName = "build")
	public static class JacksonizedNoConfigChoiceBuilder {
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		private int field1;
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		JacksonizedNoConfigChoiceBuilder() {
		}
		/**
		 * @return {@code this}.
		 */
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public JacksonizedNoConfigChoice.JacksonizedNoConfigChoiceBuilder field1(final int field1) {
			this.field1 = field1;
			return this;
		}
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public JacksonizedNoConfigChoice build() {
			return new JacksonizedNoConfigChoice(this.field1);
		}
		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public java.lang.String toString() {
			return "JacksonizedNoConfigChoice.JacksonizedNoConfigChoiceBuilder(field1=" + this.field1 + ")";
		}
	}
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public static JacksonizedNoConfigChoice.JacksonizedNoConfigChoiceBuilder builder() {
		return new JacksonizedNoConfigChoice.JacksonizedNoConfigChoiceBuilder();
	}
}