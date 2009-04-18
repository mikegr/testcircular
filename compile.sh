cd bundle1
mvn install
cd ../bundle2
mvn install
cd ../bundle3
mvn install
cd ..
cp bundle1/target/*.jar bundle2/target/*.jar bundle3/target/*.jar test
