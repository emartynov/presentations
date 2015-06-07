##Why it is important to have template project
 * Actual information for latest tested dependencies, initial code and documentation
 * Clone and hack
##Opportunity we had to create it, initial thoughts and philosophy
 * We just started new project again
 * How are these nice things that we already discovered and used
 * Do we use latest components and what are details of their usage
 * This is crafted repository - tracking changes, incorporating new thoughts and updates
##Basic overview - app, android library and java library
 * Three modules
 * Test examples
##Solution for specifying dependencies versions
 * All versions in parent build.gradle
 * properties.gradle only used for gradle forking, multi building, etc
 * Android library keeps own proguard rules (under discussion)
## Project languages, some tricks for faster build, revision in version, etc
 * java 1.7
 * gradle 2.4
 * gradle daemon and parallel build
##Iteration start, GitFlow and jenkins plugin
 * Git flow
 * Dependencies update every iteration (dependenciesUpdate)
 * every feature branch gets new jenkins job
##Dependency injection
 * Dagger 2.0
##Support library, OrmLite, EventBus, Licences dialog
 * Default open source dependencies
##Presenter, View, ViewModel
##Nearest future for template project
 * Clabash tests template for acceptance tests
 * Robolectric upgrade
 * Test new android tools and librarios just announced on IO
 * Try separate dex for each dependency and API	 21
 * Java 8, RetroLambda, RxJava
 * Kotlin or Groovy
##Q&A
