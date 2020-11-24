
#!/bin/bash

# Clean any previous Dokka docs.
rm -rf docs/api

# Build the coil-base docs.
./gradlew clean :library:dokkaGfm :library-no-op:dokkaGfm

# Work around Dokka failing to link against external links generated from 'gfm' sources.
cp docs/api/library/package-list package-list-coil-base
sed -i '' 's/$dokka.linkExtension:md/$dokka.linkExtension:html/g' package-list-coil-base

# Clean up.
rm package-list-coil-base package-list-okio