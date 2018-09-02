$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("OtherFeature.feature");
formatter.feature({
  "line": 1,
  "name": "This feature is designed to validate multiple sets of data",
  "description": "",
  "id": "this-feature-is-designed-to-validate-multiple-sets-of-data",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "scenario description",
  "description": "",
  "id": "this-feature-is-designed-to-validate-multiple-sets-of-data;scenario-description",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Custom"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "a precondition has value \"\u003cBrowser\u003e\" with \"\u003cUrl\u003e\"",
  "keyword": "Given "
});
formatter.examples({
  "line": 7,
  "name": "",
  "description": "",
  "id": "this-feature-is-designed-to-validate-multiple-sets-of-data;scenario-description;",
  "rows": [
    {
      "cells": [
        "Browser",
        "Url"
      ],
      "line": 8,
      "id": "this-feature-is-designed-to-validate-multiple-sets-of-data;scenario-description;;1"
    },
    {
      "cells": [
        "ff",
        "http://demo.nopcommerce.com/"
      ],
      "line": 9,
      "id": "this-feature-is-designed-to-validate-multiple-sets-of-data;scenario-description;;2"
    },
    {
      "cells": [
        "chrome",
        "http://demo.nopcommerce.com/"
      ],
      "line": 10,
      "id": "this-feature-is-designed-to-validate-multiple-sets-of-data;scenario-description;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 9,
  "name": "scenario description",
  "description": "",
  "id": "this-feature-is-designed-to-validate-multiple-sets-of-data;scenario-description;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Custom"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "a precondition has value \"ff\" with \"http://demo.nopcommerce.com/\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "S98765_TC_MultiDataProviders.a_launching()"
});
formatter.result({
  "duration": 132668067,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "scenario description",
  "description": "",
  "id": "this-feature-is-designed-to-validate-multiple-sets-of-data;scenario-description;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Custom"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "a precondition has value \"chrome\" with \"http://demo.nopcommerce.com/\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "S98765_TC_MultiDataProviders.a_launching()"
});
formatter.result({
  "duration": 78917,
  "status": "passed"
});
});