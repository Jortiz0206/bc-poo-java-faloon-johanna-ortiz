# Class Hierarchy - Week 04

## Diagram

      BeautyProfessional
             |
      +------+------+
      |             |
 Esthetician   MakeupArtist

## Justification
The beauty center requires different types of professionals:
- Estheticians who perform facials, skincare, and treatments.
- Makeup artists who prepare clients for events.

Both share common attributes (name, ID, base salary), so a parent class avoids repetition.

## Inherited Attributes
- name (String)
- id (String)
- baseSalary (double)

## Overridden Methods
### Esthetician
- calculateSalary(): adds a bonus based on years of experience.

### MakeupArtist
- calculateSalary(): adds extra payment per event performed.
