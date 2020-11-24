#!/bin/sh

DOCS_ROOT=docs

[ -d $DOCS_ROOT ] && rm -r $DOCS_ROOT
mkdir $DOCS_ROOT

# Clear out the old API docs
[ -d docs/api ] && rm -r docs/api
# Build the docs with dokka
./gradlew dokkaGfm

# Convert docs/xxx.md links to just xxx/
sed -i.bak 's/docs\/\([a-zA-Z-]*\).md/\1/' $DOCS_ROOT/index.md

#########################
# Tidy up Dokka output
#########################

# Remove all of the line breaks in the docs
find $DOCS_ROOT/api/ -name '*.md' -exec sed -i.bak 's/<br><br>//g' {} \;
# Remove the random androidJvm headers
find $DOCS_ROOT/api/ -name '*.md' -exec sed -i.bak 's/\[*androidJvm\]*//g' {} \;
# Remove the 'Brief description' headers
find $DOCS_ROOT/api/ -name '*.md' -exec sed -i.bak 's/Brief description//g' {} \;
# Remove the 'Brief description' headers
find $DOCS_ROOT/api/ -name '*.md' -exec sed -i.bak 's/Content//g' {} \;
# Remove the 'Brief description' headers
find $DOCS_ROOT/api/ -name '*.md' -exec sed -i.bak 's/More info//g' {} \;