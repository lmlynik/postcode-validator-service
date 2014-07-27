name := "dropizardService"

libraryDependencies := Seq(
  "io.dropwizard" % "dropwizard-core" % "0.7.1",
  "org.mongodb" % "mongo-java-driver" % "2.11.3",
  "org.mongodb.morphia" % "morphia" % "0.108")

Revolver.settings

mainClass in Revolver.reStart := Some("pl.mlynik.PostcodeValidatorApplication")

Revolver.reStartArgs := Seq("server", "/Users/lukaszm/Documents/code/postcode-validator/src/main/resources/config.yaml")