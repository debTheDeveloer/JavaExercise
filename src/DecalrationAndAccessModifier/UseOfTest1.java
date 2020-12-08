package DecalrationAndAccessModifier;

import Others.LearnigImportFeature; //Non static import

import static Others.LearnigImportFeature.nonPackageStaticMethod;//Static import

public class UseOfTest1 {

    //For ths opearaton we dnt need to import any class as both the classes are inside same package.
    public void useTest1StaticMethod(){
        Test1.staticMethod();
        Test1 t1 = new Test1();
        t1.nonStsaticMethod();
    }


    //Here we have to import the class as the class is out of this package.
    public void useTest1NonStaticMethod(){
        nonPackageStaticMethod(); //For this we can use static import or we can se imported Classname.method name concept.
        LearnigImportFeature l = new LearnigImportFeature(); //For accessing non-static method of put side package class
                                                            //we have to import the class as well as we have to make obj of it.
        l.nonPackageNonStaticMethod();

    }
}
