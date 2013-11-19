This is a project template for a Java Hadoop map-reduce process.

### Preconfigured Items

 * Ant build script
 * Hadoop .jars
 * JUnit .jars
 * Checkstyle configuration
 * Code coverage tools
 * Git will ignore the /bin, /build, and /jar folders created by the Eclipse and Ant script builds.

### Usage Steps

 1. **Fork this repository** to start a new map-reduce project.
 2. Clone the new repository.
 3. (optional) Import the project to Eclipse.
 	* The project will initially be named *starter-java-mr* so you should rename the project within Eclipse.
 4. Change the project name on the first line of build.xml. The build script uses this field to control the name of the jar files it produces.
 5. Replace these instructions in the README.md file with useful information about your project.
 6. Write your code.

### Project Directory Layout

 * src/ - Source code for the project.
 * test/ - Tests for the project. They should follow the same package layout as src/.
 * scripts/ - Script files for the project (e.g. .pig, .sh files).
 * lib/ - Libraries used by the project
	* prod/ - Libraries that are required at runtime (e.g. guava, trove, joda-time).
	* vendor/ - Libraries required at runtime but are expected to be available on the server where the application will run (e.g. hadoop-core, commons-logging).
	* tools/ - Libraries required at build or test time but not runtime (e.g. junit, emma, hamcrest).
	* javadoc/ - Source or javadoc .jar or .zip files for included libraries in the prod, tools, and vendor directories.  
