package be.vdab.goededoel.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class GoedeDoelTest {
	private static final String NAAM = "CliniClowns";
	private GoedeDoel doel;

	@BeforeEach
	void beforeEach() {
		doel = new GoedeDoel(NAAM);
	}

	@Test
	void getNaam() {
		assertThat(doel.getNaam()).isEqualTo(NAAM);
	}

	@Test
	void nieuwGDgeenOpbrengst(){
		assertThat(doel.getOpgebracht()).isZero();
	}
	@Test
	void doelenMetZelfdeNaam(){
		assertThat(doel).isEqualTo(new GoedeDoel(NAAM));
	}
	@Test
	void doelenMetVerschillendeNaam(){
		assertThat(doel).isNotEqualTo(new GoedeDoel("WWF"));
	}
	@Test
	void doelVerschiltVanAnderType(){
		assertThat(doel).isNotEqualTo(BigDecimal.ZERO);
	}
}
