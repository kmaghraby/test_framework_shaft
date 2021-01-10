#!/bin/bash
parent_path=$( cd "$(dirname "${BASH_SOURCE[0]}")" ; pwd -P )
cd "/Users/kareem.elmaghraby/.m2/repository/allure/allure-2.13.7/bin/"
bash allure serve "$parent_path/allure-results"
exit