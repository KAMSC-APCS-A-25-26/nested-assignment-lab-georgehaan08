#!/bin/bash

echo "🧪 Running Grading System Tests..."

# Make sure we're in the right directory
cd "$(dirname "$0")/.."

# Run the GradingSystem tests only
echo "📋 Running Grading System tests..."
mvn test "-Dtest=GradingSystemTest" --batch-mode

if [ $? -eq 0 ]; then
    echo "✅ All Grading System tests passed! Great job!"
else
    echo "❌ Some Grading System tests failed. Check your implementation."
    exit 1
fi
