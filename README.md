# ant-examples
Simple Java application for learning the Ant build tool

## Requirements

* Java 8
* Ant
* Ant source (org.apache.tools.ant) for creating custom tasks

## Basics

* `ant`
* `ant -projecthelp`
* `ant -f ant-hello-world.xml`

## Properties

* `ant -f ant-properties.xml`
* `ant local-property -f ant-properties.xml`
* `ant cli-property -DuserProperty1 "cli value" -f ant-properties.xml`

## Java related tasks

* `ant` compile and run the sample Hello World! application

## File related tasks

* `ant create-file -f ant-file-tasks.xml`
* `ant delete-file -f ant-file-tasks.xml`
* `ant create-directory -f ant-file-tasks.xml`
* `ant delete-directory -f ant-file-tasks.xml`

## Execution related tasks 

* `ant file-tasks.create-file -f ant-execution-tasks.xml`
* `ant file-tasks.delete-file -f ant-execution-tasks.xml`
* `ant hello -f ant-execution-tasks.xml`
* `ant target-call -f ant-execution-tasks.xml`
* `ant list-files -f ant-execution-tasks.xml`

## License

This project is licensed under the terms of the [MIT License (MIT)](LICENSE).
