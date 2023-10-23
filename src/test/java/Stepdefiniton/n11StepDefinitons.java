package Stepdefiniton;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Pages.n11Pages;
import util.DriverFactory;

public class n11StepDefinitons {

    n11Pages n11Pages = new n11Pages(DriverFactory.getDriver());



    @When("Kategorilere tiklanir")
    public void kategorilereTiklanir() {
        n11Pages.kategoriTiklama();
    }

    @When("Elektronik tiklanir")
    public void elektronikTiklanir() {
        n11Pages.elektronikTiklanir();
    }

    @When("TelefonveAksesuarlari secilir")
    public void telefonveaksesuarlariSecilir() {
        n11Pages.telefonveaksesuarlariSecilir();
    }

    @When("Cep telefonu secilir")
    public void cepTelefonuSecilir() {
        n11Pages.cepTelefonuSecilir();
    }

    @When("Filtreleme tiklanir")
    public void filtrelemeTiklanir() {
        n11Pages.filtrelemeTiklanir();
    }

    @When("Filtreleme yapilir")
    public void filtrelemeYapilir() {
        n11Pages.Filtrelemeyapilir();

    }

    @When("Sonuclarigöstere tiklanir")
    public void sonuclarigöstereTiklanir() {
        n11Pages.sonuclarigöstereTiklanir();
    }

    @When("Urun sepete eklenir")
    public void urunSepeteEklenir() {
        n11Pages.urunSepeteEklenir();
    }

    @When("Sepetime gidilir")
    public void sepetimeGidilir() {
        n11Pages.sepetimeGidilir();
    }

    @Then("Sepete urun geldigi kontrol edilir.")
    public void sepeteUrunGeldigiKontrolEdilir() {
        n11Pages.sepeteUrunGeldigiKontrolEdilir();
    }
}
