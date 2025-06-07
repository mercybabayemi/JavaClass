public class BaseConverterFromOneBaseToAnother {
    private final GivenBaseToBaseTenFirst givenBaseToBaseTenFirst = new GivenBaseToBaseTenFirst();
    private final BaseTenToTargetBase baseTenToTargetBase = new BaseTenToTargetBase();

    public int getNumberConvertedFromOneOneBaseToAnother(int initialNumberBase, int targetNumberBase, int number) {
        int baseTenValue = givenBaseToBaseTenFirst.getBaseTen(number, initialNumberBase);
        return baseTenToTargetBase.getTargetBaseConversion(baseTenValue, targetNumberBase);
    }
}
