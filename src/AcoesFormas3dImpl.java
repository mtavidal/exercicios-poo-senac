public class AcoesFormas3dImpl implements AcoesFormas<FormaGeometrica3D>{
    @Override
    public FormaGeometrica3D translacao(FormaGeometrica3D forma) {
        //TODO: implementar translação
        System.out.println(forma.getClass().getCanonicalName()  + " fez translação.");
        return null;
    }

    @Override
    public FormaGeometrica3D escala(FormaGeometrica3D forma) {
        //TODO: implementar escala
        System.out.println(forma.getClass().getCanonicalName()  + " fez escala.");
        return null;
    }

    @Override
    public FormaGeometrica3D rotacao(FormaGeometrica3D forma) {
        //TODO: implementar rotação
        System.out.println(forma.getClass().getCanonicalName() + " fez rotação.");
        return null;
    }
}
