package pl.edu.zut.wo.wzorce.pilot;

import pl.edu.zut.wo.wzorce.pilot.polecenia.*;

import pl.edu.zut.wo.wzorce.pilot.sterowniki.*;

public class FabrykaZaprogramowanySuperPilot {

    SuperPilot zbuduj() {
        SuperPilot superPilot = new SuperPilot();

        Swiatlo salonSwiatlo = new Swiatlo("Salon");
        Swiatlo kuchniaSwiatlo = new Swiatlo("Kuchnia");
        WentylatorSufitowy wentylatorSufitowy = new WentylatorSufitowy("Salon");
        DrzwiGarażu drzwiGarazu = new DrzwiGarażu("Garaz");
        WieżaStereo wiezaStereo = new WieżaStereo("Salon");
        Jacuzzi jacuzzi = new Jacuzzi();
        TV telewizor = new TV("Salon");
        Polecenie salonSwiatloWlacz = new PolecenieWlaczSwiatlo(salonSwiatlo);
        Polecenie salonSwiatloWylacz = new PolecenieWylaczSwiatlo(salonSwiatlo);
        Polecenie kuchniaSwiatloWlacz = new PolecenieWlaczSwiatlo(kuchniaSwiatlo);
        Polecenie kuchniaSwiatloWylacz = new PolecenieWylaczSwiatlo(kuchniaSwiatlo);
        Polecenie wentylatorWysokieObroty = new WentylatorSufitowyWysokieObroty(wentylatorSufitowy);
        Polecenie wylaczWentylatorSufitowy = new WylaczWentylatorSufitowy(wentylatorSufitowy);
        Polecenie otworzDrzwiGarazowe = new OtworzDrzwiGarazowe(drzwiGarazu);
        Polecenie zamknijDrzwiGarazowe = new ZamknijDrzwiGarazowe(drzwiGarazu);
        Polecenie wiezaSteregoWlaczCD = new WiezaStereoWlaczCD(wiezaStereo);
        Polecenie wylaczWiezaStereo = new WylaczWiezaStereo(wiezaStereo);
        Polecenie wlaczTelewizor = new WlaczTelewizor(telewizor);
        Polecenie wylaczTelewizor = new WylaczTelewizor(telewizor);
        Polecenie przelaczTelewizorNaDVD = new PrzelaczNaDVD(telewizor);
        Polecenie przygotujKapielWJacuzzi = new PrzygotujKapielWJacuzzi(jacuzzi);
        Polecenie wylaczJacuzzi = new WylaczJacuzzi(jacuzzi);
        Polecenie wszystkieSwiatlaWlacz = new MakroPolecenie(
                new Polecenie[] { salonSwiatloWlacz, kuchniaSwiatloWylacz });
        Polecenie wszystkieSwiatlaWylacz = new MakroPolecenie(
                new Polecenie[] { salonSwiatloWylacz, kuchniaSwiatloWylacz });

        Polecenie trybImprezaWlacz = new MakroPolecenie(
                new Polecenie[] { wszystkieSwiatlaWylacz, wiezaSteregoWlaczCD, wlaczTelewizor, przelaczTelewizorNaDVD,
                        przygotujKapielWJacuzzi });

        Polecenie trybImprezaWylacz = new MakroPolecenie(
                new Polecenie[] { wszystkieSwiatlaWlacz, wylaczWiezaStereo, wylaczTelewizor, wylaczJacuzzi });

        superPilot.ustawPolecenie(0, salonSwiatloWlacz, salonSwiatloWylacz);
        superPilot.ustawPolecenie(1, kuchniaSwiatloWlacz, salonSwiatloWylacz);
        superPilot.ustawPolecenie(2, wentylatorWysokieObroty, wylaczWentylatorSufitowy);
        superPilot.ustawPolecenie(3, otworzDrzwiGarazowe, zamknijDrzwiGarazowe);
        superPilot.ustawPolecenie(4, wiezaSteregoWlaczCD, wylaczWiezaStereo);
        superPilot.ustawPolecenie(5, wszystkieSwiatlaWlacz, wszystkieSwiatlaWylacz);
        superPilot.ustawPolecenie(6, trybImprezaWlacz, trybImprezaWylacz);

        return superPilot;
    }

}
