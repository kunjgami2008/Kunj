---
name: Kinetic Strike
colors:
  surface: '#fcf9f8'
  surface-dim: '#dcd9d9'
  surface-bright: '#fcf9f8'
  surface-container-lowest: '#ffffff'
  surface-container-low: '#f6f3f2'
  surface-container: '#f0eded'
  surface-container-high: '#eae7e7'
  surface-container-highest: '#e5e2e1'
  on-surface: '#1b1c1c'
  on-surface-variant: '#454652'
  inverse-surface: '#303030'
  inverse-on-surface: '#f3f0ef'
  outline: '#767683'
  outline-variant: '#c6c5d4'
  surface-tint: '#4c56af'
  primary: '#000666'
  on-primary: '#ffffff'
  primary-container: '#1a237e'
  on-primary-container: '#8690ee'
  inverse-primary: '#bdc2ff'
  secondary: '#9f4200'
  on-secondary: '#ffffff'
  secondary-container: '#fd6c00'
  on-secondary-container: '#562000'
  tertiary: '#191b1c'
  on-tertiary: '#ffffff'
  tertiary-container: '#2e3030'
  on-tertiary-container: '#969798'
  error: '#ba1a1a'
  on-error: '#ffffff'
  error-container: '#ffdad6'
  on-error-container: '#93000a'
  primary-fixed: '#e0e0ff'
  primary-fixed-dim: '#bdc2ff'
  on-primary-fixed: '#000767'
  on-primary-fixed-variant: '#343d96'
  secondary-fixed: '#ffdbcb'
  secondary-fixed-dim: '#ffb692'
  on-secondary-fixed: '#341100'
  on-secondary-fixed-variant: '#7a3000'
  tertiary-fixed: '#e2e2e2'
  tertiary-fixed-dim: '#c6c6c7'
  on-tertiary-fixed: '#1a1c1c'
  on-tertiary-fixed-variant: '#454747'
  background: '#fcf9f8'
  on-background: '#1b1c1c'
  surface-variant: '#e5e2e1'
typography:
  display-lg:
    fontFamily: Montserrat
    fontSize: 48px
    fontWeight: '800'
    lineHeight: 56px
    letterSpacing: -0.02em
  headline-lg:
    fontFamily: Montserrat
    fontSize: 32px
    fontWeight: '700'
    lineHeight: 40px
  headline-lg-mobile:
    fontFamily: Montserrat
    fontSize: 24px
    fontWeight: '700'
    lineHeight: 32px
  headline-md:
    fontFamily: Montserrat
    fontSize: 24px
    fontWeight: '600'
    lineHeight: 32px
  body-lg:
    fontFamily: Inter
    fontSize: 18px
    fontWeight: '400'
    lineHeight: 28px
  body-md:
    fontFamily: Inter
    fontSize: 16px
    fontWeight: '400'
    lineHeight: 24px
  label-md:
    fontFamily: Inter
    fontSize: 14px
    fontWeight: '600'
    lineHeight: 20px
    letterSpacing: 0.05em
  caption:
    fontFamily: Inter
    fontSize: 12px
    fontWeight: '500'
    lineHeight: 16px
rounded:
  sm: 0.25rem
  DEFAULT: 0.5rem
  md: 0.75rem
  lg: 1rem
  xl: 1.5rem
  full: 9999px
spacing:
  base: 8px
  xs: 4px
  sm: 12px
  md: 24px
  lg: 40px
  xl: 64px
  gutter: 24px
  margin-mobile: 16px
  margin-desktop: 48px
---

## Brand & Style

The design system is engineered for the high-intensity, tactical world of professional Kabaddi. It captures the raw energy of the mat through a **Corporate Modern** lens infused with **Athletic High-Performance** aesthetics. The target audience includes league managers, coaches, and elite athletes who require data-rich environments that feel as dynamic as the sport itself.

The visual language balances professional reliability with the urgency of live competition. It utilizes high-contrast color blocking, expansive whitespace to maintain clarity during high-pressure moments, and a systematic approach to movement and depth. The emotional response is one of confidence, precision, and momentum.

## Colors

The palette is anchored by **Deep Navy (#1A237E)**, representing the authority and tradition of the sport. **Vibrant Orange (#FF6D00)** serves as the "Action Color," used exclusively for interactive elements, primary call-to-actions, and highlighting critical "Raid" or "Tackle" moments.

- **Primary (Navy):** Used for navigation backgrounds, headers, and primary branding.
- **Secondary (Orange):** Used for focus states, progress indicators, and high-priority buttons.
- **Surface:** A clean white background keeps the interface legible, while a soft off-white tertiary color defines container backgrounds and secondary sections.
- **Functional:** Success (Green), Warning (Amber), and Error (Red) are used sparingly to maintain the primary brand impact.

## Typography

Typography in this design system is built for impact and readability. **Montserrat** is utilized for headlines to provide a bold, geometric, and athletic feel. It should be used in heavier weights (Bold/ExtraBold) to establish a strong visual hierarchy.

**Inter** handles all body copy and functional labels. Its neutral, systematic nature ensures that dense statistics and player data remain legible across all device sizes. For labels and data headers, use Inter in SemiBold with uppercase styling and slight tracking to mimic sports jerseys and scoreboards.

## Layout & Spacing

The design system employs a **12-column fluid grid** for desktop and a **4-column grid** for mobile. A strict 8px base unit drives all spacing decisions, ensuring a mathematical rhythm throughout the interface.

- **Desktop:** 12 columns with 24px gutters. Content should be contained within a 1440px max-width wrapper.
- **Tablet:** 8 columns with 20px gutters. Sidebars collapse into a compact "rail" view.
- **Mobile:** 4 columns with 16px margins. Vertical stack is the default for all cards and data modules.
- **Padding:** Use "md" (24px) for standard container padding to provide sufficient breathing room for high-density data.

## Elevation & Depth

Hierarchy is established through **Ambient Shadows** and subtle tonal layering. Surfaces do not "float" aggressively; instead, they lift slightly off the canvas to indicate interactivity.

- **Level 0 (Canvas):** Tertiary light grey (#F5F5F5) background.
- **Level 1 (Cards/Surface):** Pure White (#FFFFFF) with a 1px stroke in #E0E0E0. No shadow.
- **Level 2 (Hover/Active):** Pure White with a soft, diffused shadow (0px 4px 12px rgba(26, 35, 126, 0.08)).
- **Level 3 (Modals/Overlays):** Pure White with a deep shadow (0px 12px 24px rgba(0, 0, 0, 0.12)).

Avoid heavy black shadows. Use a subtle Navy tint in the shadow color to maintain brand cohesion.

## Shapes

The design system uses **Rounded (0.5rem)** corners as the standard. This softens the aggressive nature of the bold typography while maintaining a modern, professional look.

- **Standard (8px):** Applied to cards, input fields, and standard buttons.
- **Large (16px):** Applied to major containers and dashboard widgets.
- **Pill (Full):** Used exclusively for status chips (e.g., "Active," "Bench") and secondary action buttons to distinguish them from primary structural elements.

## Components

### Buttons
- **Primary:** Solid Vibrant Orange background with White text. Bold weight.
- **Secondary:** Deep Navy border (2px) with Navy text.
- **Ghost:** No border, Navy text, with a light grey background on hover.

### Cards
Cards are the primary container for athlete stats and match data. They feature 16px internal padding, 8px rounded corners, and a 1px border. For "Live" matches, the card border color should pulse with the Secondary Orange.

### Inputs & Fields
Input fields use a 1px Navy border that increases to 2px Orange on focus. Labels are positioned above the field using the `label-md` typographic style.

### Specialized Components
- **Scoreboard Module:** Uses Montserrat ExtraBold for scores. High-contrast Navy background with Orange accents for the leading team.
- **Player Status Chips:** Small, pill-shaped indicators. Use Navy for "Playing," Grey for "Substitute," and Orange for "Raider."
- **Data Tables:** High-density rows with alternating 4px vertical Orange accents for selected rows. Column headers use the `label-md` style for maximum clarity.