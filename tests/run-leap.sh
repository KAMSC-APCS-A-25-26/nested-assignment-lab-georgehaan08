#!/bin/bash

echo "🧪 Running Leap Year Checker Tests..."

cd "$(dirname "$0")/.."

echo "📋 Running Leap Year Checker tests..."
mvn test "-Dtest=LeapYearCheckerTest" --batch-mode

if [ $? -eq 0 ]; then
    echo "✅ All Leap Year Checker tests passed! Great job!"
else
    echo "❌ Some Leap Year Checker tests failed. Check your implementation."
    exit 1
fi
