#!/bin/bash

# Copy outside files into the docs folder.
sed -e '/full documentation here/ { N; d; }' < README.md > docs/index.md
cp CHANGELOG.md docs/changelog.md
cp coil-gif/README.md docs/gifs.md
cp coil-svg/README.md docs/svgs.md
cp coil-video/README.md docs/videos.md
cp logo.svg docs/logo.svg
cp README-ko.md docs/README-ko.md
cp README-zh.md docs/README-zh.md

# Clean up.
rm package-list-coil-base package-list-okio