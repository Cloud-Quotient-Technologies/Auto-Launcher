# easyLaunch
Intitutive Web tool to schedule tests, run tests & maintains Dashboard for quality Metrics. It hides complexities of Jenkins , yet provides intellegent resource aware scheduling mechanism. This allows designers, developers, project managers, in-house testers and anyone else to Launch tests on few clicks. It maintains inventory of hardware/DUT , their availability , to schedule tests. easyLaunch  can be plugged into CI/CD  Machinery seamlessly. It supports Linux and Windows platform.
Its agnostic of the tests and test framework. You can use your in-house or any open source test framework (example Robot-Framework). 
User Selects the Test suites via GUI, tool automatically lanuches tests on free testbed. HTTP requests is generated to send the data to the backend. The backend hosts Restful architecture running on Tomcat server which executes automated scripts to perform desired test. 
Jenkins plugin and google graphs are used to generate the KPI Dashboard. 
Technologies:- HTML,ANGULARJS, HTTP, JERSEY FRAMEWORK, JAVA, REST ARCHITECTURE, TOMCAT SERVER, PYTHON, ROBOT FRAMEWORK.

