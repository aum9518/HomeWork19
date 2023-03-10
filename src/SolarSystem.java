public enum SolarSystem {
    MERCURY ("Меркурий кун системасындагы планеталардын эн кичинекейи жана кунго эн жакыны."),
    VENUS ("Кун системасындагы эн ысык планета жана башка планеталарга салыштырмалуу тескери багытта жай айланат."),
    EARTH ("Бул биздин уйубуз жана кун системасындагы жалгыз суюктук суусу бар планета"),
    MARS ("Марс бул чандуу муздак жана атмосферасы жука планета. Окумуштуулардын изилдоосу боюнча миллиард жылдар мурун ал жакта суу жана жылуу атмосферасы калын болгон дешет."),
    JUPITER ("Юпитер - бул жалпы кун системасындагы планеталардын массасын кошкондо да эки эсе чонураак."),
    SATURN ("Сатурун - бул кун системасындагы уникалдуу планета десек болот себеби анын шакекчелери башка планеталаргга караганда уникалдуу жана кооз корунот."),
    URANUS ("Уран - кун системасындагы 7чи планета ал орбитанын тегиздигинен 90 градуска кыйшайуу менен айланат бул уникалдуулук аны капталы менен айланып жаткандай корсотот"),
    NEPTUNE ("Нептун - бул кун системасындагы эн алыс жайгашкан планета жана муздак карангы жана ундун ылдамдыгынан тез соккон шамал бар.");
    private String futures;

    SolarSystem(String futures) {
        this.futures = futures;
    }

    SolarSystem() {
    }

    public String getFutures() {
        return futures;
    }

    public void setFutures(String futures) {
        this.futures = futures;
    }
}
