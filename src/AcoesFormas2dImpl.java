public class AcoesFormas2dImpl implements AcoesFormas<FormaGeometrica2D>{
    @Override
    public FormaGeometrica2D translacao(FormaGeometrica2D forma) {
        //TODO: implementar translação
        System.out.println(forma.getClass().getCanonicalName()  + " fez translação.");
        return null;
    }

    @Override
    public FormaGeometrica2D escala(FormaGeometrica2D forma) {
        //TODO: implementar escala
        System.out.println(forma.getClass().getCanonicalName()  + " fez escala.");
        return null;
    }

    @Override
    public FormaGeometrica2D rotacao(FormaGeometrica2D forma) {
        //TODO: implementar rotacao
        System.out.println(forma.getClass().getCanonicalName()  + " fez rotação.");
        return null;
    }
}
